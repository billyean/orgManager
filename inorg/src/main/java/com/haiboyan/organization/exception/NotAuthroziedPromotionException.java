/*
 * Copyright [2017] [Haibo(Tristan) Yan]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.haiboyan.organization.exception;

/**
 * Special rule checking before promotion happens, NotAuthroziedPromotionException thrown is the employee is not
 * qualified for such promotion.
 */
public class NotAuthroziedPromotionException extends Exception {
    public NotAuthroziedPromotionException(String reason) {
        super(String.format("Not ready to be promoted: %s", reason));
    }
}
