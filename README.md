# Automation for SnapChat mobile app (Java, TestNG, Selenium WebDriver, Appium)

Test assignment:

Using Appium and Java: Automate the process of log in and log out from Snapchat mobile app on Android device with stock firmware (not-rooted)
As a result, please provide:
source code of your Java classes;
compiled jar file;
appium configuration file;

Solution: 

Tested on Xiaomi Redmi 4 with Android 6.0.
Appium version 1.7.2 or above.
Installed Android SDK and properly set PATH are required. 
Also you should set emulator or device cabalilities files in \src\test\resources\props
User credentials set in \src\test\resources\props\user.properties

To run test from IDE, use testng.xml configuration file. 
To run test from command line, use 'mvn test' command.
Check logs: mavenTestRunLog.txt, appium-server-logs.txt