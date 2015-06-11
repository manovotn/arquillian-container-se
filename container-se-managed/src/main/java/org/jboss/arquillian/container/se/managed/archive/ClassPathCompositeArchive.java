package org.jboss.arquillian.container.se.managed.archive;

import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

public interface ClassPathCompositeArchive extends Archive<JavaArchive> {

    ClassPathCompositeArchive add(JavaArchive... archive);

}