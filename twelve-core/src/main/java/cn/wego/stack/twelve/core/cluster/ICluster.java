package cn.wego.stack.twelve.core.cluster;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public interface ICluster {

    /**
     * join to twelve's cluster
     */
    void joinCluster();

    /**
     * Become the master of the twelve's cluster
     */
    void doMaster();

    /**
     * Become the slave of the twelve's slave
     */
    void doSlave();
}
