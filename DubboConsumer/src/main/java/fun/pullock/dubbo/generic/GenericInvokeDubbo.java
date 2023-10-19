package fun.pullock.dubbo.generic;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.alibaba.dubbo.rpc.service.GenericService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GenericInvokeDubbo {

    public final static String PROTOCOL = "zookeeper";

    public final static String REGISTRY_ADDRESS = "127.0.0.1:2181";

    public final static String APP_NAME = "app-name";

    private Map<String, ReferenceConfig> referenceConfigMap = new ConcurrentHashMap<String, ReferenceConfig>();

    public Object invokeService(String interfaceClass, String method, String[] paramTypes, Object[] params) {
        ReferenceConfigCache cache = null;
        ReferenceConfig<GenericService> referenceConfig = null;
        try {
            referenceConfig = referenceConfigMap.get(interfaceClass);
            if (referenceConfig == null) {
                referenceConfig = new ReferenceConfig<>();

                ApplicationConfig application = new ApplicationConfig();
                application.setName(APP_NAME);
                referenceConfig.setApplication(application);

                RegistryConfig registry = new RegistryConfig();
                registry.setProtocol(PROTOCOL);
                registry.setAddress(REGISTRY_ADDRESS);
                referenceConfig.setRegistry(registry);

                ConsumerConfig consumerConfig = new ConsumerConfig();
                consumerConfig.setTimeout(5000);
                consumerConfig.setRetries(0);
                referenceConfig.setConsumer(consumerConfig);

                referenceConfig.setGeneric(true);
                // referenceConfig.setVersion();
                referenceConfig.setInterface(interfaceClass);
                referenceConfigMap.put(interfaceClass, referenceConfig);
            }
            cache = ReferenceConfigCache.getCache();
            GenericService genericService = cache.get(referenceConfig);
            return genericService.$invoke(method, paramTypes, params);
        } catch (IllegalStateException e) {
            referenceConfigMap.remove(interfaceClass);
            if (cache != null) {
                cache.destroy(referenceConfig);
            }

            e.printStackTrace();
            return null;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
