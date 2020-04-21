/**
 *
 */
package se.redfield.knime.neo4jextension;

import org.neo4j.driver.Driver;

/**
 * @author Vyacheslav Soldatov <vyacheslav.soldatov@inbox.ru>
 *
 */
@FunctionalInterface
public interface WithDriverRunnable<R> {
    R run(Driver driver);
}