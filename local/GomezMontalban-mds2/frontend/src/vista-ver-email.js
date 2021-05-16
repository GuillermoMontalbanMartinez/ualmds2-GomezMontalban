import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaVerEmail extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <h1 style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-m); margin-top: var(--lumo-space-xl);">Correo</h1>
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-m);">
   <p>Autor :</p>
   <vaadin-text-field id="autorText" style="align-self: center; margin-left: var(--lumo-space-l);" readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-m);1">
   <p>Asunto : </p>
   <vaadin-text-field id="AsuntoText" style="align-self: center;" readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-text-area id="CuerpoText" style="width: 90%; height: 90%; align-self: center;" readonly></vaadin-text-area>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin-top: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xl);">
  <vaadin-button theme="primary error" id="AtrasButton" style="margin-right: var(--lumo-space-xl);">
   Atras
  </vaadin-button>
  <vaadin-button theme="primary" id="responderButton" style="margin-left: var(--lumo-space-xl);">
   Responder
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-ver-email';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerEmail.is, VistaVerEmail);
