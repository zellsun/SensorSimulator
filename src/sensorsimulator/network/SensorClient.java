/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sensorsimulator.network;

import sensorsimulator.network.client.NetworkClient;
import sensorsimulator.network.client.NetworkClientImpl;

/**
 *
 * @author Z
 */
public class SensorClient extends NetworkClient {

    public SensorClient(NetworkClientImpl sender) {
        super(sender);
    }
    
    public void send(DataPacket packet) {
        super.send(packet.getHost(), packet.getPort(), packet.getData());
    }
}
