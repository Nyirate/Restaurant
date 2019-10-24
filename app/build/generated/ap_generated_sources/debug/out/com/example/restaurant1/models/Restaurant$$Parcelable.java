
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
public class Restaurant$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.restaurant1.models.Restaurant>
{

    private com.example.restaurant1.models.Restaurant restaurant$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Restaurant$$Parcelable>CREATOR = new Creator<Restaurant$$Parcelable>() {


        @Override
        public Restaurant$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Restaurant$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Restaurant$$Parcelable[] newArray(int size) {
            return new Restaurant$$Parcelable[size] ;
        }

    }
    ;

    public Restaurant$$Parcelable(com.example.restaurant1.models.Restaurant restaurant$$2) {
        restaurant$$0 = restaurant$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(restaurant$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.example.restaurant1.models.Restaurant restaurant$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(restaurant$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(restaurant$$1));
            parcel$$1 .writeString(restaurant$$1 .website);
            if (restaurant$$1 .address == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(restaurant$$1 .address.size());
                for (java.lang.String string$$0 : restaurant$$1 .address) {
                    parcel$$1 .writeString(string$$0);
                }
            }
            parcel$$1 .writeString(restaurant$$1 .phone);
            parcel$$1 .writeString(restaurant$$1 .imageUrl);
            parcel$$1 .writeDouble(restaurant$$1 .latitude);
            parcel$$1 .writeString(restaurant$$1 .name);
            parcel$$1 .writeDouble(restaurant$$1 .rating);
            if (restaurant$$1 .categories == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(restaurant$$1 .categories.size());
                for (java.lang.String string$$1 : restaurant$$1 .categories) {
                    parcel$$1 .writeString(string$$1);
                }
            }
            parcel$$1 .writeDouble(restaurant$$1 .longitude);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.restaurant1.models.Restaurant getParcel() {
        return restaurant$$0;
    }

    public static com.example.restaurant1.models.Restaurant read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.example.restaurant1.models.Restaurant restaurant$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            restaurant$$4 = new com.example.restaurant1.models.Restaurant();
            identityMap$$1 .put(reservation$$0, restaurant$$4);
            restaurant$$4 .website = parcel$$3 .readString();
            int int$$0 = parcel$$3 .readInt();
            java.util.ArrayList<java.lang.String> list$$0;
            if (int$$0 < 0) {
                list$$0 = null;
            } else {
                list$$0 = new java.util.ArrayList<java.lang.String>(int$$0);
                for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                    list$$0 .add(parcel$$3 .readString());
                }
            }
            restaurant$$4 .address = list$$0;
            restaurant$$4 .phone = parcel$$3 .readString();
            restaurant$$4 .imageUrl = parcel$$3 .readString();
            restaurant$$4 .latitude = parcel$$3 .readDouble();
            restaurant$$4 .name = parcel$$3 .readString();
            restaurant$$4 .rating = parcel$$3 .readDouble();
            int int$$2 = parcel$$3 .readInt();
            java.util.ArrayList<java.lang.String> list$$1;
            if (int$$2 < 0) {
                list$$1 = null;
            } else {
                list$$1 = new java.util.ArrayList<java.lang.String>(int$$2);
                for (int int$$3 = 0; (int$$3 <int$$2); int$$3 ++) {
                    list$$1 .add(parcel$$3 .readString());
                }
            }
            restaurant$$4 .categories = list$$1;
            restaurant$$4 .longitude = parcel$$3 .readDouble();
            com.example.restaurant1.models.Restaurant restaurant$$3 = restaurant$$4;
            identityMap$$1 .put(identity$$1, restaurant$$3);
            return restaurant$$3;
        }
    }

}
