/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sensorsimulator.network;

import java.util.Arrays;
import java.util.Date;
import sensorsimulator.network.server.NetworkServer;
import sensorsimulator.network.server.NetworkServerImpl;

/**
 *
 * @author Z
 */
public class SensorServer extends NetworkServer {

    public SensorServer(NetworkServerImpl receiver) {
        super(receiver);
    }

    @Override
    public void process(DataPacket packet) {
        NetworkTrafficLogger.getInstance().writeLogToTextArea("Process Data: " + new String(packet.getData()));
    }
}
