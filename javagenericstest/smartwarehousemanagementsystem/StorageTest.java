    package com.example.javagenerics.smartwarehousemanagementsystem;

    import org.junit.jupiter.api.Test;

    import java.util.List;

    import static org.junit.jupiter.api.Assertions.*;

    class StorageTest {
        @Test
        public void FurnitureTest() {
            Storage<Furniture> furnitureStorage = new Storage<>();
            furnitureStorage.add(new Furniture("Bed", 3, "abc"));
            List<Furniture> list = furnitureStorage.getList();
            assertEquals(1, list.size());
        }
    }