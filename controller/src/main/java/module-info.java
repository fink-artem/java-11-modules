module ru.test.controller {

    exports ru.test.controller;

    requires ru.test.service;
    requires ru.test.dto;
    requires ru.test.mapper;

    requires spring.web;
    requires static lombok;
}