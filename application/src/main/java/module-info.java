module ru.test.application {

    opens ru.test to spring.core, spring.beans, spring.context;

    requires ru.test.controller;
    requires ru.test.service;
    requires ru.test.repository;
    // Зачем?
    requires java.xml.bind;
    // Зачем?
    requires net.bytebuddy;

    requires spring.boot;
    requires spring.boot.autoconfigure;
}