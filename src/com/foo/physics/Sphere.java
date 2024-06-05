// Package structure
package com.foo.physics;

// Import necessary classes
import Model.Solid;
import Model.SphereProperties;

/**
 * This class represents a sphere and provides methods to calculate its properties.
 * It is part of the Foo et al. parameterization software package.
 */
public class Sphere implements Solid<SphereProperties> {

    /**
     * Calculates the volume of the sphere.
     * @param sphereProperties The properties of the sphere.
     * @return The volume of the sphere.
     */
    @Override
    public double volume(SphereProperties sphereProperties) {
        return (4.0/3.0)*Math.PI*Math.pow(sphereProperties.getRadius(), 3);
    }
}