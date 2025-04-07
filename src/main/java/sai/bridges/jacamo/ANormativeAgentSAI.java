package sai.bridges.jacamo;

import adaptation.NPLAInterpreter;

/**
 * An extended normative agent with the capability to adapt regulations.
 */
public class ANormativeAgentSAI extends NormativeAgentSai {

    public ANormativeAgentSAI() {
        this.interpreter = new NPLAInterpreter();
    }

    public NPLAInterpreter getNPLAInterpreter() {
        return (NPLAInterpreter) this.interpreter;
    }

}
