package sexy.kostya.april;

import java.util.List;

/**
 * Created by k.shandurenko on 04/04/2019
 */
public interface AprilInstance {

    /**
     * Connect this node to the proxies (Distributors).
     * System.exit(18) will be called whether initial connection was unsuccessful.
     * List of proxies addresses will be taken from the configuration file (config.properties).
     */
    void connect();

    /**
     * Connect this node to the proxies (Distributors).
     * System.exit(18) will be called whether initial connection was unsuccessful.
     * @param proxies list of proxies addresses (for example, [localhost:25000, localhost:25001, localhost:25002].
     */
    void connect(List<String> proxies);

    /**
     * Checks whether this node is connected to any of proxies (Distributors).
     * @return true/false.
     */
    boolean isConnected();

    /**
     * The name of this node which was given to it by proxies (Distributors).
     * @return name of this node in the network.
     */
    String getInstanceName();

    /**
     * Register and instantiate given retriever interface.
     * @param retrieverClass retriever interface.
     * @param <T> interface type.
     * @return instance of given retriever interface with all methods proxied to use remote procedure calls.
     */
    <T> T registerRpcRetriever(Class<T> retrieverClass);

    /**
     * Register and instantiate given producer class.
     * @param producerClass producer class.
     * @param <T> class type.
     * @return instance of given producer class.
     */
    <T> T registerRpcProducer(Class<T> producerClass);

}
