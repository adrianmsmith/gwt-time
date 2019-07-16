package com.google.gwt.user.client.rpc.core.java.time;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

import java.time.LocalDate;

@SuppressWarnings("unused")
public class LocalDate_CustomFieldSerializer {
    
    public static void deserialize(SerializationStreamReader streamReader, LocalDate instance) { }

    public static void serialize(SerializationStreamWriter streamWriter, LocalDate instance) 
    throws SerializationException {
        streamWriter.writeInt(instance.getYear());
        streamWriter.writeInt(instance.getMonthValue());
        streamWriter.writeInt(instance.getDayOfMonth());
    }

    public static LocalDate instantiate(SerializationStreamReader streamReader) throws SerializationException {
        return LocalDate.of(streamReader.readInt(), streamReader.readInt(), streamReader.readInt());
    }
}
