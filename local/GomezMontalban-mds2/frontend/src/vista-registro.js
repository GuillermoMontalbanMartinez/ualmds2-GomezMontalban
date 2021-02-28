import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-registro`
 *
 * VistaRegistro element.
 *
 * @customElement
 * @polymer
 */
class VistaRegistro extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-registro';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRegistro.is, VistaRegistro);
