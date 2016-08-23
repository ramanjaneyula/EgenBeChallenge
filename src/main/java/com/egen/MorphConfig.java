package com.egen;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.net.UnknownHostException;

/**
 * Created by Ram .
 */
public class MorphConfig {

    private String packageName = "com.egen.model";

    private static MorphConfig morphiaConfig = new MorphConfig();

    private Datastore datastore = null;

    private MorphConfig() {
        Morphia morphia = new Morphia();
        try {
            datastore = morphia.createDatastore(new MongoClient(), "morphia_client");
            datastore.ensureIndexes();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public static MorphConfig getInstance() {
        return morphiaConfig;
    }
}
