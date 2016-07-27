package com.ht.extra.service;

import com.ht.extra.pojo.Inpatient;
import org.springframework.stereotype.Component;

/**
 * Created by Dell on 2016/7/14.
 */
public interface InpatientService {
    Inpatient getInpatientByIpid(String ipid);

}
