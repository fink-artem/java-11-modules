module ru.test.application {

    opens ru.test to spring.core;
    exports ru.test;

    requires ru.test.controller;
    requires ru.test.service;
    requires ru.test.repository;

    requires spring.boot;
    requires spring.boot.autoconfigure;
}