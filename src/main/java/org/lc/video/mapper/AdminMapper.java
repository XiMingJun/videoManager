package org.lc.video.mapper;

import org.lc.video.model.Admin;

public interface AdminMapper {


    Admin getAdminByLoginName(String name);
}
