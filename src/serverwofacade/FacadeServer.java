package serverwofacade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUFGAMING
 */
public class FacadeServer {
       private static ScheduleServer server = new ScheduleServer();
       public static void startEngine(){
            server.startBooting();
            server.readSystemConfigFile();
            server.init();
            server.initializeContext();
            server.initializeListeners();
            server.createSystemObjects();
            System.out.println("Start working......");
       }
       
        public static void endEngine(){
            System.out.println("After work done.........");
            server.releaseProcesses();
            server.destory();
            server.destroySystemObjects();
            server.destoryListeners();
            server.destoryContext();
            server.shutdown();
       }
}
