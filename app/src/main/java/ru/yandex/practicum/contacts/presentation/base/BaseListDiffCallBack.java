package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallBack <T extends ListDiffInterface> extends DiffUtil.ItemCallback<T> {

    @Override
    public boolean areItemsTheSame(@NonNull ListDiffInterface oldItem, @NonNull ListDiffInterface newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull ListDiffInterface oldItem, @NonNull ListDiffInterface newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public T getChangePayload(@NonNull T oldItem, @NonNull T newItem){
        return newItem;
    }
}
