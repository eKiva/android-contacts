package ru.yandex.practicum.contacts.presentation.base;


import androidx.annotation.NonNull;

import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactTypeUi;

public interface ListDiffInterface<T> {

    public boolean theSameAs(T t);
    public boolean equals(Object o);

}
