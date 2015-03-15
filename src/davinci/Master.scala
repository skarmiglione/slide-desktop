package davinci

import java.awt.EventQueue
import java.util
import enums.ConnectionMode
import gui.Home

object Master {
    val connections: util.HashSet[ConnectionMode] = new util.HashSet[ConnectionMode]()

    def main(args: Array[String]): Unit = {
        EventQueue.invokeLater( new Runnable {
            override def run(): Unit = {
                Home.getInstance.show()
            }
        })
    }

    def hasConnection(connection: ConnectionMode): Boolean = {
        connections.contains(connection)
    }

    def multipleConnections: Boolean = connections.size > 1

    def addConnection(newConnectionStatus: ConnectionMode): Unit = connections.add(newConnectionStatus)

    def removeConnection(connectionStatus: ConnectionMode): Unit = {
        if (connections.contains(connectionStatus)) {
            connections.remove(connectionStatus)
        }
    }
}