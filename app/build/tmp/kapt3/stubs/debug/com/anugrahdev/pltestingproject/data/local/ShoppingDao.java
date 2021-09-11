package com.anugrahdev.pltestingproject.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/anugrahdev/pltestingproject/data/local/ShoppingDao;", "", "deleteShoppingItem", "", "shoppingItem", "Lcom/anugrahdev/pltestingproject/data/local/ShoppingItem;", "(Lcom/anugrahdev/pltestingproject/data/local/ShoppingItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertShoppingItem", "observeAllShoppingItems", "Landroidx/lifecycle/LiveData;", "", "observeTotalPrice", "", "app_debug"})
public abstract interface ShoppingDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertShoppingItem(@org.jetbrains.annotations.NotNull()
    com.anugrahdev.pltestingproject.data.local.ShoppingItem shoppingItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteShoppingItem(@org.jetbrains.annotations.NotNull()
    com.anugrahdev.pltestingproject.data.local.ShoppingItem shoppingItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM shopping_items")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.anugrahdev.pltestingproject.data.local.ShoppingItem>> observeAllShoppingItems();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT SUM(price*amount) FROM shopping_items")
    public abstract androidx.lifecycle.LiveData<java.lang.Float> observeTotalPrice();
}