import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaBannerNoRegistrado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; align-items: center; justify-content: center;" theme="spacing">
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0;">
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; justify-content: center; width: 25%; height: 100%; align-items: center;">
   <iron-icon style="flex-shrink: 0; align-self: center; width: 25%; height: 25%;" icon="lumo:eye"></iron-icon>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%; height: 100%;">
   <vaadin-text-field placeholder="Search" style="flex-shrink: 0; align-self: center; width: 100%; height: 100%;">
    <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
   </vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; height: 100%; flex-grow: 1;">
   <iron-icon style="flex-shrink: 0; align-self: center; flex-grow: 1;"></iron-icon>
   <vaadin-button theme="primary" id="vaadinButton" style="align-self: center; flex-shrink: 0; flex-grow: 1;">
    Iniciar sesión
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; flex-grow: 1;">
   <vaadin-button theme="icon" aria-label="Add new" style="width: 100%; height: 100%; flex-shrink: 0; align-self: center; flex-grow: 1;">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-banner-no-registrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBannerNoRegistrado.is, VistaBannerNoRegistrado);
