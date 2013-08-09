/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.oasisdigital.sdre.order;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

/**
 * Repository to manage {@link Part} instances.
 * 
 * @author Oliver Gierke
 */
@RestResource(path = "orders", rel = "orders")
public interface PartRepository extends PagingAndSortingRepository<Part, Long> {

	/**
	 * Returns all {@link Order}s with the given {@link Status}.
	 * 
	 * @param status must not be {@literal null}.
	 * @return
	 */
	//List<Order> findByStatus(@Param("status") Status status);
}
