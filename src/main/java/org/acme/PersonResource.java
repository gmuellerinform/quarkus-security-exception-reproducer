package org.acme;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface PersonResource extends PanacheEntityResource<Person, Long>{
    
}
