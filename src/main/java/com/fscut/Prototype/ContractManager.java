package com.fscut.Prototype;

import com.fscut.Prototype.contract.LeaseContract;
import com.fscut.Prototype.contract.SalesContract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuxinwei
 * @date 2022/12/9 11:21
 */
public class ContractManager {

    private static final Map<String, AbstractContract> CACHE = new HashMap<>();

    /**
     * 管理所有原型的集合,负责初始化所有原型
     */
    public static void loadCache() {
        AbstractContract sales = new SalesContract();
        CACHE.put("sales", sales);
        AbstractContract lease = new LeaseContract();
        CACHE.put("lease", lease);
    }

    /**
     * 获取拷贝对象
     */
    public static AbstractContract newInstance(String key) throws CloneNotSupportedException {
        AbstractContract contract = CACHE.get(key);
        if (contract == null) {
            throw new RuntimeException("不支持的合同类型");
        }
        return contract.clone();
    }
}
