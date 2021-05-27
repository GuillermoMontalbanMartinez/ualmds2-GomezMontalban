import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEmailAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="border:1px solid black; justify-content: space-between;">
 <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-start; align-items: center;">
  <p style="flex-grow: 0; flex-shrink: 1;">Autor:</p>
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-text-field id="AutorText" style="align-self: center;" readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <p>Asunto:</p>
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-text-field id="AsuntoText" style="align-self: center;" readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 20%;">
  <vaadin-button theme="primary" id="VerBoton" style="border:1px solid black; justify-content: space-between;">
   Ver
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-email-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmailAdmin.is, VistaEmailAdmin);
