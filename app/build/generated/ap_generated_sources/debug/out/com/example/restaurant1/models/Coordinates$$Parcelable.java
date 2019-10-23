
package com.example.restaurant1.models;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Coordinates$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.restaurant1.models.Coordinates>
{

    private com.example.restaurant1.models.Coordinates coordinates$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Coordinates$$Parcelable>CREATOR = new Creator<Coordinates$$Parcelable>() {


        @Override
        public Coordinates$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Coordinates$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Coordinates$$Parcelable[] newArray(int size) {
            return new Coordinates$$Parcelable[size] ;
        }

    }
    ;

    public Coordinates$$Parcelable(com.example.restaurant1.models.Coordinates coordinates$$2) {
        coordinates$$0 = coordinates$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(coordinates$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.example.restaurant1.models.Coordinates coordinates$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(coordinates$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(coordinates$$1));
            if (coordinates$$1 .getLatitude() == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeDouble(coordinates$$1 .getLatitude());
            }
            if (coordinates$$1 .getLongitude() == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeDouble(coordinates$$1 .getLongitude());
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.restaurant1.models.Coordinates getParcel() {
        return coordinates$$0;
    }

    public static com.example.restaurant1.models.Coordinates read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.example.restaurant1.models.Coordinates coordinates$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            coordinates$$4 = new com.example.restaurant1.models.Coordinates();
            identityMap$$1 .put(reservation$$0, coordinates$$4);
            int int$$0 = parcel$$3 .readInt();
            java.lang.Double double$$0;
            if (int$$0 < 0) {
                double$$0 = null;
            } else {
                double$$0 = parcel$$3 .readDouble();
            }
            coordinates$$4 .setLatitude(double$$0);
            int int$$1 = parcel$$3 .readInt();
            java.lang.Double double$$1;
            if (int$$1 < 0) {
                double$$1 = null;
            } else {
                double$$1 = parcel$$3 .readDouble();
            }
            coordinates$$4 .setLongitude(double$$1);
            com.example.restaurant1.models.Coordinates coordinates$$3 = coordinates$$4;
            identityMap$$1 .put(identity$$1, coordinates$$3);
            return coordinates$$3;
        }
    }

}
