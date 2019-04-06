package sexy.kostya.april;

/**
 * This interface allows you to listen to specific producers connections and disconnections.
 * To use it, instantiate your copy of the interface and register it
 * using April.getInstance().registerConnectionListener().
 *
 * Each listener is of some listener group.
 * It is used to determine which connection listeners will be notified when
 * new producer of given name connects or disconnects. When new producer connects or disconnects:
 * - All ConnectionListeners of default (null) listener group will be notified
 * - Only one ConnectionListener of each other group will be notified (if there are any)
 *
 * Created by k.shandurenko on 06/04/2019
 */
public interface ConnectionListener {

    /**
     * Logic to be processed when new producer connects.
     * @param nodeName node name of connected producer.
     */
    void onProducerConnected(String nodeName);

    /**
     * Logic to be processed when producer disconnects.
     * @param nodeName node name of disconnected producer.
     */
    void onProducerDisconnected(String nodeName);

    /**
     * Name of producers for which connections/disconnections you are interested to listen to.
     * @return producers name.
     */
    String getProducerName();

    /**
     * When new producer connects or old one disconnects, all ConnectionListeners of default (null)
     * listener group will be notified. As for other groups, only one ConnectionListener of each will be notified.
     * @return listener group.
     */
    default String getListenerGroup() {
        return null;
    }

}
