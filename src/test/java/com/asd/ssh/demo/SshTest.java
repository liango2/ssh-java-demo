/**
 *
 */
package com.asd.ssh.demo;

import org.junit.Test;

/**
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 2015年11月28日
 * @since 1.1
 */
public class SshTest {

    private String host;
    private int sshPort;
    private String user;
    private String password;
    private String catalinaHome;
    private int catalinaPort;
    private String loggerFile;

    @Test
    public void testSsh() throws Exception {
        //TomcatRestartUtil.restart(host, sshPort, user, password, catalinaHome, catalinaPort, loggerFile);
        SshUtil ssh = SshUtil.config("192.168.99.100", "docker", "tcuser", 22);
        // 1.获取pid
        String s = null;
        s = ssh.execute("pwd");
        System.out.println("s = " + s);

        s = ssh.execute("cd ..");
        System.out.println("s = " + s);

        s = ssh.execute("pwd");
        System.out.println("s = " + s);
    }

}
