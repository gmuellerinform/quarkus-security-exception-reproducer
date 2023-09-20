package org.acme;

import io.quarkus.hibernate.orm.rest.data.panache.RestDataResourceMethodListener;
import io.quarkus.security.ForbiddenException;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonResourceListener implements RestDataResourceMethodListener<Person> {
    @Override
    public void onBeforeAdd(Person person) {
        throw new ForbiddenException("Cannot add a person");
    }
}