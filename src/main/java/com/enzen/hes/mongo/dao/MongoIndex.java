/* **********************************************************************
 * 83incs CONFIDENTIAL
 **********************************************************************
 *
 *  [2017] - [2022] 83incs Ltd.
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of 83incs Ltd, IoT83 Ltd, its suppliers (if any), its subsidiaries (if any) and
 * Source Code Licensees (if any).  The intellectual and technical concepts contained
 * herein are proprietary to 83incs Ltd, IoT83 Ltd, its subsidiaries (if any) and
 * Source Code Licensees (if any) and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from 83incs Ltd or IoT83 Ltd.
 ****************************************************************************
 */
package com.enzen.hes.mongo.dao;


import com.enzen.hes.mongo.enums.Order;

public class MongoIndex {

    private String field;
    private Order order;
    private boolean unique;

    public String getField() {
        return field;
    }

    public MongoIndex setField(String field) {
        this.field = field;
        return this;
    }

    public Order getOrder() {
        return order;
    }

    public MongoIndex setOrder(Order order) {
        this.order = order;
        return this;
    }

    public boolean isUnique() {
        return unique;
    }

    public MongoIndex setUnique(boolean unique) {
        this.unique = unique;
        return this;
    }

    @Override
    public String toString() {
        return "MongoIndex{" +
                "field='" + field + '\'' +
                ", order=" + order +
                ", unique=" + unique +
                '}';
    }
}
