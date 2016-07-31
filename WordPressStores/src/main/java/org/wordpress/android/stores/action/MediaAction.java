package org.wordpress.android.stores.action;

import org.wordpress.android.stores.annotations.Action;
import org.wordpress.android.stores.annotations.ActionEnum;
import org.wordpress.android.stores.annotations.action.IAction;
import org.wordpress.android.stores.store.MediaStore.FetchMediaPayload;
import org.wordpress.android.stores.store.MediaStore.ChangeMediaPayload;

@ActionEnum
public enum MediaAction implements IAction {
    // Remote actions
    @Action(payloadType = FetchMediaPayload.class)  FETCH_ALL_MEDIA,
    @Action(payloadType = FetchMediaPayload.class)  FETCH_MEDIA,
    @Action(payloadType = ChangeMediaPayload.class) PUSH_MEDIA,
    @Action(payloadType = ChangeMediaPayload.class) DELETE_MEDIA,

    // Local actions
    @Action(payloadType = ChangeMediaPayload.class) UPDATE_MEDIA,
    @Action(payloadType = ChangeMediaPayload.class) REMOVE_MEDIA,

    // Complex actions
    @Action(payloadType = ChangeMediaPayload.class) UPLOAD_MEDIA,
}
