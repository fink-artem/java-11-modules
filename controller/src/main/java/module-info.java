module ru.test.controller {

    opens ru.test.controller to spring.beans, spring.web;

    requires ru.test.service;
    requires ru.test.dto;
    requires ru.test.mapper;

    requires spring.web;
    requires lombok;
}