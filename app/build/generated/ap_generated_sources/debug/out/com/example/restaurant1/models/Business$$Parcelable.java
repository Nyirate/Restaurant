
package com.example.restaurant1.models;

import android.location.Location;
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
public class Business$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.restaurant1.models.Business>
{

    private com.example.restaurant1.models.Business business$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Business$$Parcelable>CREATOR = new Creator<Business$$Parcelable>() {


        @Override
        public Business$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Business$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Business$$Parcelable[] newArray(int size) {
            return new Business$$Parcelable[size] ;
        }

    }
    ;

    public Business$$Parcelable(com.example.restaurant1.models.Business business$$2) {
        business$$0 = business$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(business$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.example.restaurant1.models.Business business$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(business$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(business$$1));
            if (business$$1 .getDistance() == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeDouble(business$$1 .getDistance());
            }
            if (business$$1 .getRating() == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeDouble(business$$1 .getRating());
            }
            com.example.restaurant1.models.Coordinates$$Parcelable.write(business$$1 .getCoordinates(), parcel$$1, flags$$0, identityMap$$0);
            if (business$$1 .getTransactions() == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(business$$1 .getTransactions().size());
                for (java.lang.String string$$0 : business$$1 .getTransactions()) {
                    parcel$$1 .writeString(string$$0);
                }
            }
            parcel$$1 .writeString(business$$1 .getUrl());
            if (business$$1 .getIsClosed() == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((business$$1 .getIsClosed()? 1 : 0));
            }
            parcel$$1 .writeString(business$$1 .getPhone());
            if (business$$1 .getReviewCount() == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeDouble(business$$1 .getReviewCount());
            }
            parcel$$1 .writeString(business$$1 .getPrice());
            parcel$$1 .writeString(business$$1 .getImageUrl());
            parcel$$1 .writeString(business$$1 .getName());
            parcel$$1 .writeString(business$$1 .getAlias());
            parcel$$1 .writeParcelable(business$$1 .getLocation(), flags$$0);
            parcel$$1 .writeString(business$$1 .getId());
            if (business$$1 .getCategories() == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(business$$1 .getCategories().size());
                for (com.example.restaurant1.models.Category category$$0 : business$$1 .getCategories()) {
                    com.example.restaurant1.models.Category$$Parcelable.write(category$$0, parcel$$1, flags$$0, identityMap$$0);
                }
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.restaurant1.models.Business getParcel() {
        return business$$0;
    }

    public static com.example.restaurant1.models.Business read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.example.restaurant1.models.Business business$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            business$$4 = new com.example.restaurant1.models.Business();
            identityMap$$1 .put(reservation$$0, business$$4);
            int int$$0 = parcel$$3 .readInt();
            java.lang.Double double$$0;
            if (int$$0 < 0) {
                double$$0 = null;
            } else {
                double$$0 = parcel$$3 .readDouble();
            }
            business$$4 .setDistance(double$$0);
            int int$$1 = parcel$$3 .readInt();
            java.lang.Double double$$1;
            if (int$$1 < 0) {
                double$$1 = null;
            } else {
                double$$1 = parcel$$3 .readDouble();
            }
            business$$4 .setRating(double$$1);
            Coordinates coordinates$$0 = com.example.restaurant1.models.Coordinates$$Parcelable.read(parcel$$3, identityMap$$1);
            business$$4 .setCoordinates(coordinates$$0);
            int int$$2 = parcel$$3 .readInt();
            java.util.ArrayList<java.lang.String> list$$0;
            if (int$$2 < 0) {
                list$$0 = null;
            } else {
                list$$0 = new java.util.ArrayList<java.lang.String>(int$$2);
                for (int int$$3 = 0; (int$$3 <int$$2); int$$3 ++) {
                    list$$0 .add(parcel$$3 .readString());
                }
            }
            business$$4 .setTransactions(list$$0);
            business$$4 .setUrl(parcel$$3 .readString());
            int int$$4 = parcel$$3 .readInt();
            Boolean boolean$$0;
            if (int$$4 < 0) {
                boolean$$0 = null;
            } else {
                boolean$$0 = (parcel$$3 .readInt() == 1);
            }
            business$$4 .setIsClosed(boolean$$0);
            business$$4 .setPhone(parcel$$3 .readString());
            int int$$5 = parcel$$3 .readInt();
            java.lang.Double double$$2;
            if (int$$5 < 0) {
                double$$2 = null;
            } else {
                double$$2 = parcel$$3 .readDouble();
            }
            business$$4 .setReviewCount(double$$2);
            business$$4 .setPrice(parcel$$3 .readString());
            business$$4 .setImageUrl(parcel$$3 .readString());
            business$$4 .setName(parcel$$3 .readString());
            business$$4 .setAlias(parcel$$3 .readString());
            business$$4 .setLocation(((Location) parcel$$3 .readParcelable(Business$$Parcelable.class.getClassLoader())));
            business$$4 .setId(parcel$$3 .readString());
            int int$$6 = parcel$$3 .readInt();
            java.util.ArrayList<com.example.restaurant1.models.Category> list$$1;
            if (int$$6 < 0) {
                list$$1 = null;
            } else {
                list$$1 = new java.util.ArrayList<com.example.restaurant1.models.Category>(int$$6);
                for (int int$$7 = 0; (int$$7 <int$$6); int$$7 ++) {
                    com.example.restaurant1.models.Category category$$1 = com.example.restaurant1.models.Category$$Parcelable.read(parcel$$3, identityMap$$1);
                    list$$1 .add(category$$1);
                }
            }
            business$$4 .setCategories(list$$1);
            com.example.restaurant1.models.Business business$$3 = business$$4;
            identityMap$$1 .put(identity$$1, business$$3);
            return business$$3;
        }
    }

}
