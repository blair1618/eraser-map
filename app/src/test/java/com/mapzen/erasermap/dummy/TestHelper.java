package com.mapzen.erasermap.dummy;

import com.mapzen.pelias.SimpleFeature;
import com.mapzen.pelias.gson.Feature;
import com.mapzen.pelias.gson.Geometry;
import com.mapzen.pelias.gson.Properties;

import java.util.ArrayList;
import java.util.List;

public class TestHelper {
    public static final String TEST_TEXT = "Text";
    public static final String TEST_LOCALITY = "Locality";
    public static final String TEST_LOCAL_ADMIN = "Local Admin";
    public static final String TEST_ADMIN1_ABBR = "Admin1 Abbr";

    public static Feature getTestFeature() {
        return getTestFeature(0.0, 0.0);
    }

    public static Feature getTestFeature(double lat, double lon) {
        Feature feature = new Feature();
        Properties properties = new Properties();
        properties.setText(TEST_TEXT);
        properties.setLocality(TEST_LOCALITY);
        properties.setLocalAdmin(TEST_LOCAL_ADMIN);
        properties.setAdmin1Abbr(TEST_ADMIN1_ABBR);
        feature.setProperties(properties);
        Geometry geometry = new Geometry();
        List<Double> coordinates = new ArrayList<>();
        coordinates.add(lon);
        coordinates.add(lat);
        geometry.setCoordinates(coordinates);
        feature.setGeometry(geometry);
        return feature;
    }

    public static SimpleFeature getTestSimpleFeature() {
        return SimpleFeature.fromFeature(getTestFeature());
    }

    public static SimpleFeature getTestSimpleFeature(double lat, double lon) {
        return SimpleFeature.fromFeature(getTestFeature(lat, lon));
    }
}
