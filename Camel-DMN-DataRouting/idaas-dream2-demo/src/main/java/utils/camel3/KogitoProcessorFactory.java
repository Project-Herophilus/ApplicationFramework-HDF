package utils.camel3;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.apache.camel.Processor;
import org.kie.kogito.decision.DecisionModels;

@ApplicationScoped
public class KogitoProcessorFactory {

    @Inject
    DecisionModels kogitoDMNModels;

    public Processor decisionProcessor(String namespace, String name) {
        return new DMNEvaluateAllKogitoProcessor(kogitoDMNModels.getDecisionModel(namespace, name));
    }
}
