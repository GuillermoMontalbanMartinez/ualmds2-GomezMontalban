import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-dar-alta-cuenta`
 *
 * VistaDarAltaCuenta element.
 *
 * @customElement
 * @polymer
 */
class VistaDarAltaCuenta extends PolymerElement {

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
        return 'vista-dar-alta-cuenta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDarAltaCuenta.is, VistaDarAltaCuenta);
