/*
 * Copyright (C) 2016 Arthur Gregorio, AG.Software
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.webbudget.domain.repositories.tools;

import br.com.webbudget.infraestructure.components.table.Page;
import br.com.webbudget.infraestructure.components.table.PageRequest;
import br.com.webbudget.domain.entities.tools.Message;
import org.apache.deltaspike.data.api.EntityRepository;

/**
 * 
 * @author Arthur Gregorio
 *
 * @version 2.0.0
 * @since 2.2.0, 24/02/2016
 */
public interface MessageRepository extends EntityRepository<Message, Long> {
    
//    /**
//     * 
//     * @param sender
//     * @param filter
//     * @param pageRequest
//     * @return 
//     */
//    Page<Message> listSent(User sender, String filter, PageRequest pageRequest);
}