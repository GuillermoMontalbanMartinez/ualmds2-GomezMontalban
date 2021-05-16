import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEmail extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout theme="spacing" style="border:1px solid black; justify-content: space-between;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="justify-content: flex-start; align-items: center;">
  <p style="flex-grow: 0; flex-shrink: 1;">Autor:</p>
  <vaadin-horizontal-layout theme="spacing" id="layoutautor">
   <vaadin-text-field id="vaadinTextField" style="align-self: center;" dir="asuntoText" readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <p>Asunto:</p>
  <vaadin-horizontal-layout theme="spacing" id="layoutasunto">
   <vaadin-text-field id="asuntoText" readonly style="align-self: center;"></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 20%;" id="vaadinHorizontalLayout">
  <vaadin-button theme="primary" id="VerButton">
   Ver
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-email';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmail.is, VistaEmail);
