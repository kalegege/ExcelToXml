package model;

import java.util.List;

/**
 * Created by kale on 2017/9/21.
 */
public class ADI {
    private List<BaseObject> baseObjectList;
    private List<Mapping> mappingList;

    public ADI() {
    }

    public List<BaseObject> getBaseObjectList() {
        return baseObjectList;
    }

    public void setBaseObjectList(List<BaseObject> baseObjectList) {
        this.baseObjectList = baseObjectList;
    }

    public List<Mapping> getMappingList() {
        return mappingList;
    }

    public void setMappingList(List<Mapping> mappingList) {
        this.mappingList = mappingList;
    }
}
