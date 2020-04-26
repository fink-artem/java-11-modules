module ru.test.entity {

    opens ru.test.entity to org.hibernate.orm.core, spring.core;

    exports ru.test.entity;

    requires static lombok;
    requires java.persistence;
}