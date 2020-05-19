/**
 *
 */
package se.redfield.knime.neo4j.reader;

import java.util.Map;

import org.knime.core.node.workflow.FlowVariable;
import org.knime.core.node.workflow.VariableType;

/**
 * @author Vyacheslav Soldatov <vyacheslav.soldatov@inbox.ru>
 *
 */
@FunctionalInterface
public interface FlowVariablesProvider {
    Map<String, FlowVariable> getAvailableFlowVariables(final VariableType<?>[] types);
}
