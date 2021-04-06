
try{
        SQLiteDatabase database = this.openOrCreateDatabase("Ogrenciler",MODE_PRIVATE,null);
        database.execSQL("CREATE TABLE IF NOT EXISTS ogrenci (id INTEGER PRIMARY KEY, isim VARCHAR, yas INT)");
        // database.execSQL("INSERT INTO ogrenci (isim, yas) VALUES ('Eyup',22)");
        // database.execSQL("INSERT INTO ogrenci (isim, yas) VALUES ('Burak',29)");
        // database.execSQL("INSERT INTO ogrenci (isim, yas) VALUES ('İsmail',25)");


        // database.execSQL("UPDATE ogrenci SET isim = 'Yavru' WHERE isim = 'Burak'");
        // database.execSQL("DELETE FROM ogrenci WHERE id = 2");

        //Cursor cursor = database.rawQuery("SELECT * FROM ogrenci",null);

        // Cursor cursor = database.rawQuery("SELECT * FROM ogrenci WHERE isim = 'Eyup'",null);
        Cursor cursor = database.rawQuery("SELECT * FROM ogrenci WHERE isim LIKE 'İ%'",null);


        int isimIndex = cursor.getColumnIndex("isim");
        int yasIndex = cursor.getColumnIndex("yas");
        int idIndex = cursor.getColumnIndex("id");

        while(cursor.moveToNext()){
        System.out.println("İsim: " + cursor.getString(isimIndex));
        System.out.println("Yas: " + cursor.getString(yasIndex));
        System.out.println("Id: " + cursor.getString(idIndex));
        }
        cursor.close();
        }catch (Exception e){

        }
        }
        }
