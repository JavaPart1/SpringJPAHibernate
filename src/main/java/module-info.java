open module eu.noelvaes.spring{
    requires spring.core;
    requires spring.context;
    requires spring.beans;
    requires java.sql;
    requires java.logging;
    requires org.aspectj.weaver;
    requires net.bytebuddy;
    requires java.xml.bind;
    requires java.annotation;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires spring.boot.starter.security;
    requires spring.security.core;
    requires spring.security.config;
    requires spring.web;
}