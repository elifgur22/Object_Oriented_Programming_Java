package com.elif.repository;

import com.elif.entity.Insan;

public interface ISaglik {
    public void asilamaYap(Insan insan);
    public Insan[] asilananInsanlarTumu();
}
