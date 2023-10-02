package com.sky.service;

import com.sky.entity.AddressBook;
import java.util.List;

public interface AddressBookService {

    /**
     * 条件查询
     * @param addressBook:
     * @return List<AddressBook>
     */
    List<AddressBook> list(AddressBook addressBook);

    /**
     * 新增地址
     * @param addressBook:
     * @return void
     */
    void save(AddressBook addressBook);

    /**
     * 根据id查询
     * @param id:
     * @return AddressBook
     */
    AddressBook getById(Long id);

    /**
     * 根据id修改地址
     * @param addressBook:
     * @return void
     */
    void update(AddressBook addressBook);

    /**
     * 设置默认地址
     * @param addressBook:
     * @return void
     */
    void setDefault(AddressBook addressBook);

    /**
     * 根据id删除地址
     * @param id:
     * @return void
     */
    void deleteById(Long id);

}
