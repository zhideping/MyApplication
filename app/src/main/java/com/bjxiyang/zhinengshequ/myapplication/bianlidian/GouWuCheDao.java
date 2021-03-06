package com.bjxiyang.zhinengshequ.myapplication.bianlidian;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "GOU_WU_CHE".
*/
public class GouWuCheDao extends AbstractDao<GouWuChe, Long> {

    public static final String TABLENAME = "GOU_WU_CHE";

    /**
     * Properties of entity GouWuChe.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Spid = new Property(1, int.class, "spid", false, "SPID");
        public final static Property UserId = new Property(2, int.class, "userId", false, "USER_ID");
        public final static Property SellerId = new Property(3, int.class, "sellerId", false, "SELLER_ID");
        public final static Property Count = new Property(4, int.class, "count", false, "COUNT");
        public final static Property Logo = new Property(5, String.class, "logo", false, "LOGO");
        public final static Property Name = new Property(6, String.class, "name", false, "NAME");
        public final static Property Des = new Property(7, String.class, "des", false, "DES");
        public final static Property ProductTypeId = new Property(8, int.class, "productTypeId", false, "PRODUCT_TYPE_ID");
        public final static Property Price = new Property(9, int.class, "price", false, "PRICE");
        public final static Property IfDiscount = new Property(10, int.class, "ifDiscount", false, "IF_DISCOUNT");
        public final static Property DiscountPrice = new Property(11, int.class, "discountPrice", false, "DISCOUNT_PRICE");
        public final static Property StockNum = new Property(12, int.class, "stockNum", false, "STOCK_NUM");
        public final static Property Status = new Property(13, int.class, "status", false, "STATUS");
    }


    public GouWuCheDao(DaoConfig config) {
        super(config);
    }
    
    public GouWuCheDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GOU_WU_CHE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"SPID\" INTEGER NOT NULL ," + // 1: spid
                "\"USER_ID\" INTEGER NOT NULL ," + // 2: userId
                "\"SELLER_ID\" INTEGER NOT NULL ," + // 3: sellerId
                "\"COUNT\" INTEGER NOT NULL ," + // 4: count
                "\"LOGO\" TEXT," + // 5: logo
                "\"NAME\" TEXT," + // 6: name
                "\"DES\" TEXT," + // 7: des
                "\"PRODUCT_TYPE_ID\" INTEGER NOT NULL ," + // 8: productTypeId
                "\"PRICE\" INTEGER NOT NULL ," + // 9: price
                "\"IF_DISCOUNT\" INTEGER NOT NULL ," + // 10: ifDiscount
                "\"DISCOUNT_PRICE\" INTEGER NOT NULL ," + // 11: discountPrice
                "\"STOCK_NUM\" INTEGER NOT NULL ," + // 12: stockNum
                "\"STATUS\" INTEGER NOT NULL );"); // 13: status
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GOU_WU_CHE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, GouWuChe entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getSpid());
        stmt.bindLong(3, entity.getUserId());
        stmt.bindLong(4, entity.getSellerId());
        stmt.bindLong(5, entity.getCount());
 
        String logo = entity.getLogo();
        if (logo != null) {
            stmt.bindString(6, logo);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(7, name);
        }
 
        String des = entity.getDes();
        if (des != null) {
            stmt.bindString(8, des);
        }
        stmt.bindLong(9, entity.getProductTypeId());
        stmt.bindLong(10, entity.getPrice());
        stmt.bindLong(11, entity.getIfDiscount());
        stmt.bindLong(12, entity.getDiscountPrice());
        stmt.bindLong(13, entity.getStockNum());
        stmt.bindLong(14, entity.getStatus());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, GouWuChe entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getSpid());
        stmt.bindLong(3, entity.getUserId());
        stmt.bindLong(4, entity.getSellerId());
        stmt.bindLong(5, entity.getCount());
 
        String logo = entity.getLogo();
        if (logo != null) {
            stmt.bindString(6, logo);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(7, name);
        }
 
        String des = entity.getDes();
        if (des != null) {
            stmt.bindString(8, des);
        }
        stmt.bindLong(9, entity.getProductTypeId());
        stmt.bindLong(10, entity.getPrice());
        stmt.bindLong(11, entity.getIfDiscount());
        stmt.bindLong(12, entity.getDiscountPrice());
        stmt.bindLong(13, entity.getStockNum());
        stmt.bindLong(14, entity.getStatus());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public GouWuChe readEntity(Cursor cursor, int offset) {
        GouWuChe entity = new GouWuChe( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // spid
            cursor.getInt(offset + 2), // userId
            cursor.getInt(offset + 3), // sellerId
            cursor.getInt(offset + 4), // count
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // logo
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // name
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // des
            cursor.getInt(offset + 8), // productTypeId
            cursor.getInt(offset + 9), // price
            cursor.getInt(offset + 10), // ifDiscount
            cursor.getInt(offset + 11), // discountPrice
            cursor.getInt(offset + 12), // stockNum
            cursor.getInt(offset + 13) // status
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, GouWuChe entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSpid(cursor.getInt(offset + 1));
        entity.setUserId(cursor.getInt(offset + 2));
        entity.setSellerId(cursor.getInt(offset + 3));
        entity.setCount(cursor.getInt(offset + 4));
        entity.setLogo(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDes(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setProductTypeId(cursor.getInt(offset + 8));
        entity.setPrice(cursor.getInt(offset + 9));
        entity.setIfDiscount(cursor.getInt(offset + 10));
        entity.setDiscountPrice(cursor.getInt(offset + 11));
        entity.setStockNum(cursor.getInt(offset + 12));
        entity.setStatus(cursor.getInt(offset + 13));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(GouWuChe entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(GouWuChe entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(GouWuChe entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
