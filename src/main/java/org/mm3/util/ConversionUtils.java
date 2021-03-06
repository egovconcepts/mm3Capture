package org.mm3.util;

public class ConversionUtils {
    public ConversionUtils() {
    }

    public static int byteArrayToLeInt(byte[] encodedValue) {
        int value = (encodedValue[3] << (Byte.SIZE * 3));
        value |= (encodedValue[2] & 0xFF) << (Byte.SIZE * 2);
        value |= (encodedValue[1] & 0xFF) << (Byte.SIZE);
        value |= (encodedValue[0] & 0xFF);
        return value;
    }

    public static byte[] leIntToByteArray(int value) {
        byte[] encodedValue = new byte[Integer.SIZE / Byte.SIZE];
        encodedValue[3] = (byte) (value >> Byte.SIZE * 3);
        encodedValue[2] = (byte) (value >> Byte.SIZE * 2);
        encodedValue[1] = (byte) (value >> Byte.SIZE);
        encodedValue[0] = (byte) value;
        return encodedValue;
    }

    public static int byteToInt(byte b) {
        return b & 0xFF;
    }
}